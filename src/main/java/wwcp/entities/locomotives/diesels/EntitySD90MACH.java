package wwcp.entities.locomotives.diesels;
//This is a documentation class for copy pasting into a Diesel train class.
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.EntityTrainCore;
import ebf.tim.registry.URIRegistry;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.MacBogieBack;
import wwcp.models.bogies.AmericanTrucks.MacBogieFront;
import wwcp.models.locomotives.diesels.SD90MACH;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

/**
 * ETERNAL NOTE: anything that applies to GenericRailTransport also applies to EntityTrain core.
 */
public class EntitySD90MACH extends EntityTrainCore {

    public static final Item thisItem = new WWCPTransport(new EntitySD90MACH(null), worldwidecontentpack.MODID,worldwidecontentpack.America);

    /**
     * these basic constructors only need to have their names changed to that of this class, that is assuming your editor doesn't automatically do that.
     * Be sure the one that takes more than a world is always first, unless you wanna compensate for that in the item declaration.
     * @see EntityTrainCore
     */

    public EntitySD90MACH(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }
    public EntitySD90MACH(World world){
        super(world);
    }

    @Override
    public String transportName() { return Transport.SD90MACH().name; }

    @Override
    public String transportcountry() { return Transport.SD90MACH().country; }

    @Override
    public String transportYear() { return Transport.SD90MACH().year; }

    @Override
    public String transportFuelType() {
        return Transport.SD90MACH().fuel;
    }
    @Override
    public boolean isFictional() {
        return Transport.SD90MACH().fictional;
    }
    @Override
    public float transportTractiveEffort() {
        return Transport.SD90MACH().tractive_effort;
    }
    @Override
    public float transportMetricHorsePower() {
        return Transport.SD90MACH().metric_horsepower;
    }
    @Override
    public float weightKg() {
        return  Transport.SD90MACH().weightinKGs;
    }

    public boolean isReinforced() {
        return Transport.SD90MACH().reinforced;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.SD90MACH().additionalTextTitle) + Transport.SD90MACH().additionalText,
                RailUtility.translate(Transport.SD90MACH().additionalTextTitle2) + Transport.SD90MACH().additionalText2};}
    }

    @Override
    public float transportTopSpeed(){return accelerator<0? Transport.SD90MACH().backTopSpeed: Transport.SD90MACH().topSpeed;}

    @Override
    public void registerSkins(){
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD90MACH/SD90MACH_UP.png",
                "textures/bogies/HTSCtruck_UP.png", "UP", "Union Pacific w/ herald");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD90MACH/SD90MACH_UP_Wings.png",
                "textures/bogies/HTSCtruck_UP.png", "UP Wings", "Union Pacific w/ wings");
        SkinRegistry.addSkin(this.getClass(),worldwidecontentpack.MODID, "textures/locomotive/Diesel/SD90MACH/SD90MACH_CP.png",
                "textures/bogies/HTSCtruck_Black.png", "CP Beaver", "Canadian Pacific with beaver logo");
    }

    /**
     * ETERNAL NOTE: though these two methods are marked depreciated, they will be supported long-run
     * the replacement method is
     *     public Bogie[] bogies()
     *     a new bogie is defined like
     *         new Bogie(ModelBase MODEL, float[] OFFSET)
     *         the reason for this new method is so bogies can have their subBogie[] variable set
     *         to add bogies on your bogie that have similar independent rotation-
     *         to the host bogie, as the host bogie has to the train.
     *
     * @return
     */
    @Override
    public ModelBase[] bogieModels() {return new ModelBase[]{new MacBogieFront(), new MacBogieBack()}; }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{3.3f,0f,0},{-3.3f,0f,0}};
    }

    @Override
    public float[] bogieLengthFromCenter(){return new float[]{3.3f,-3.3f};}

    @Override
    public List<TrainsInMotion.transportTypes> getTypes() { return TrainsInMotion.transportTypes.DIESEL.singleton();
    }

    //in what units is this?
    //ETERNAL NOTE: millibuckets, so 1000 is a bucket.
    @Override
    public float getMaxFuel(){return 1;}

    @Override
    public float[][] getRiderOffsets(){return new float[][]{{-3.6f,1.55f, -0.3f}};}


    @Override
    public boolean shouldRiderSit(){
        return true;
    }

    @Override
    public float[] getHitboxSize() {
        return new float[]{10.5f,2f,1.5f};
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Smoke offset</h2>
     * @return defines the array of positions in blocks for smoke.
     * the first number in the position defines the X/Z axis, negative values are towards the front of the train.
     * the second number defines the Y position, 0 is the rails, higher values are towards the sky.
     * the third number defines left to right, negative values are towards the right.
     * the forth number defines the grayscale color from 255 (white) to 0 (black)
     * the 5th number is for density, there's no min/max but larger numbers will create more lag.
     */

    /**
     * ETERNAL NOTE
     * getSmokeOffset has been changed to
     *     public int[] getParticleData(int id)
     *     - the id parameter defined the id of the particle defined in the model using methods like
     *     StaticModelAnimator.tagSmoke(int ID)
     *     - the return int[] value defines density, scale in percentage, and color in RGB or RGBA hex.
     *
     *     an example:
     *     public int[] getParticleData(int id){
     *         if(id==TARGET){return new int[]{DENSITY,SCALE,0xRRGGBBAA};}
     *         else {return super.getParticleData(id);}
     *     }
     */


    @Override
    public float getRenderScale() {
        return  0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0.35f,0.0F,0.F}};}
        
    /**
     * <h2>Fluid Tank Capacity</h2>
     */

    //once more what do the numbers mean
    //ETERNAL NOTE 1000 is a bucket, each number represents a new tank.
    @Override
    public int[] getTankCapacity(){return new int[]{9161};}
    //once more idem dito
    //ETERNAL NOTE RF capacity is being moved to a fluid tank, one redstone has the value of 250.
    //as of writing this the RF tank uses water, but later there will be a redstone dust fluid for it

    /**
     * <h2>fluid filter</h2>
     * defines what fluids can and can't be stored in the tank.
     * for instance if you have a wooden tanker car, you can deny fluids that are fire sources (like lava).
     */

    public int[] getParticleData(int id) {
        switch (id){
            case 0:{return new int[]{1, 50, 0x555555};}//EMD smoke
            case 1:{return super.getParticleData(id);}//heavy smoke
            case 2:{return super.getParticleData(id);}//steam
            case 3:{return super.getParticleData(id);}//led lamp
            case 4:{return super.getParticleData(id);}//reverse lamp
            case 5:{return super.getParticleData(id);}//small sphere lamp

            default:{return new int[]{5, 100, 0xf3da90};}
        }
    }

    public String[] setParticles(){

        return new String[]{"smoke ,0,-0.15,1,0,0,0,0"};

    }

    /**
     * ETERNAL NOTE: tank filters is being moved to a double array
     * the new method is
     *     public String[][] getTankFilters()
     *     for example:
     *     public String[] getTankFilters(int tank){
     *         return new String[][]{{TankOneFilterOne,TankOneFilterTwo}, {TankTwoFilterOne}};
     *     }
     *     filter strings may be the direct name of the fluid, or part of the name, for example
     *     FluidRegistry.WATER.getName() for the entire name, or "water" for part of it.
     *     mind you part names may have conflicts, "water" for example will accept the fluid registry water and
     *     hot spring water from BoP and Distilled Water from IC2 as all three names contain "water".
     *
     */

    //eeeh what
    //ETERNAL NOTE this returns if the inventory slot will accept an item.
    // slot 400 is the fuel slot. 401 is the second fuel slot if there is one. 402 is the third etc.
    // custom slots with their own slot numbers can be defined in public void initInventorySlots()
    // NOTE 2: when overriding initInventorySlots() be sure to call the super method, also always use numbers over 400
    // to prevent conflicts with other inventory functionality.
    // later on i'll need to implement an easier system for custom inventory slots.

    @Override
    public float[][] modelRotations(){return new float[][]{{0.0f, 180.0f, 0.0f}};}

    /**
     * <h2>fuel management</h2>
     * defines how the transport manages burnHeat, both in consuming items, and in managing the burnHeat.
     */
    @Override
    public void manageFuel(){
        fuelHandler.manageDiesel(this);
    }


    public Item getItem(){
        return thisItem;
    }

    public ModelBase[] getModel(){return new ModelBase[]{new SD90MACH()};}

    //For sound effects
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getHorn(){return URIRegistry.SOUND_HORN.getResource("h080brigadelok.ogg");}
    @SideOnly(Side.CLIENT)
    @Override
    public ResourceLocation getRunningSound(){return URIRegistry.SOUND_RUNNING.getResource("r080brigadelok.ogg");}
}

