//This is a documentation file for copy pasting reussable details into a tender entity class.

//This is a documentation class for copy pasting into a freight tanker entity file.
package wwcp.entities.tender;

import ebf.tim.TrainsInMotion.transportTypes;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.FuelHandler;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fluids.FluidRegistry;
import scala.tools.ant.sabbus.Make;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.tenders.Class812Tender;
import wwcp.models.tenders.MakeshiftTender;
import wwcp.worldwidecontentpack;

import java.util.List;
import java.util.UUID;

public class EntityMakeshiftTender extends GenericRailTransport {


    public EntityMakeshiftTender(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public static final Item thisItem = new WWCPTransport(new EntityMakeshiftTender(null), worldwidecontentpack.MODID, worldwidecontentpack.United_Kingdom);

    public EntityMakeshiftTender(World world) {
        super(world);
    }
    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.MakeshiftTender().reinforced;
    }

    public int[] getTankCapacity() {
        return new int[] {Transport.MakeshiftTender().tankcapacity, Transport.MakeshiftTender().tankcapacity};
    }

    public String[] getTankFilters(int tankID) {
        switch (tankID) {
            case 0: {
                return new String[]{FluidRegistry.WATER.getName()};
            }
            default:{
                return new String[]{FluidRegistry.LAVA.getName()};
            }
        }
    }

    public float weightKg() {
        return Transport.MakeshiftTender().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.MakeshiftTender().name;
    }

    public String transportcountry() { return Transport.MakeshiftTender().country; }

    public String transportYear() { return Transport.MakeshiftTender().year; }

    public float transportTopSpeed() {
        return Transport.MakeshiftTender().topSpeed;
    }

    public boolean isFictional() {
        return Transport.MakeshiftTender().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.MakeshiftTender().additionalTextTitle) + Transport.MakeshiftTender().additionalText,
                RailUtility.translate(Transport.MakeshiftTender().additionalTextTitle2) + Transport.MakeshiftTender().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.MakeshiftTender().rows;
    }

    public transportTypes getType() {
        return transportTypes.FREIGHT;
    }
    public float[][] bogieModelOffsets() {
        return null;
    }

    public ModelBase[] bogieModels() {
        return null;
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{5.0F, -5.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }
//todo change bogie length from center
    public float[][] modelOffsets() {
        return new float[][]{{0f,0f,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/tenders/MakeshiftTender.png",
                "GATX 13000 Gallon Tanker", "One of their smaller tanker cars, usually used for commodities such as molten sulfur, clay slurry, caustic soda and corn syrup.");
    }

    public List<transportTypes> getTypes() {
        return transportTypes.TANKER.singleton();
    }

    public float[][] getRiderOffsets() {
        return (float[][]) null;
    }

    public float[] getHitboxSize() {
        return new float[]{2F, 1.6F, 1.2F};
    }

    public Item getItem() {
        return thisItem;
    }

    public void manageFuel() {
        FuelHandler.manageTanker(this);
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new MakeshiftTender()};
    }
}

