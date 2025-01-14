package wwcp.entities.passengerstock;


import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.SwingMotionBogie70Ton;
import wwcp.models.passengerStock.CPMetalVan;
import wwcp.worldwidecontentpack;

import java.util.UUID;

import static ebf.tim.utility.RailUtility.DefineStack;


public class EntityCPMetalVan extends GenericRailTransport {
    private static final String[] itemDescription = new String[]{
            "\u00A77" + StatCollector.translateToLocal("menu.item.weight") + ": 2 " + StatCollector.translateToLocal("menu.item.tons"),
            "\u00A77" + StatCollector.translateToLocal("menu.item.seats") + ": 4 " + StatCollector.translateToLocal("menu.item.players")};

    public static final Item thisItem = new WWCPTransport(new EntityCPMetalVan(null), worldwidecontentpack.MODID, worldwidecontentpack.America);


    public EntityCPMetalVan(UUID owner, World world, double xPos, double yPos, double zPos) {
        super(owner, world, xPos, yPos, zPos);
    }

    public EntityCPMetalVan(World world) {
        super(world);
    }

    @Override
    public boolean isReinforced() {
        return Transport.CPMetalVan().reinforced;
    }

    @Override
    public String transportName() {
        return Transport.CPMetalVan().name;
    }

    @Override
    public String transportcountry() {
        return Transport.CPMetalVan().country;
    }

    @Override
    public String transportYear() {
        return Transport.CPMetalVan().year;
    }

    @Override
    public float weightKg() {
        return Transport.CPMetalVan().weightinKGs;
    }

    @Override
    public boolean isFictional() {
        return Transport.CPMetalVan().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {
            return new String[]{RailUtility.translate(Transport.CPMetalVan().additionalTextTitle) + Transport.CPMetalVan().additionalText,
                    RailUtility.translate(Transport.CPMetalVan().additionalTextTitle2) + Transport.CPMetalVan().additionalText2};
        }
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    /**
     * <h1>Variable Overrides</h1>
     */

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.425f, 0f, 0}, {-1.35f, 0f, 0}};
    }

    @Override
    public ModelBase[] bogieModels() { return new ModelBase[]{new SwingMotionBogie70Ton()};
    }

    /**
     * 1
     * <h2>Bogie Offset</h2>
     */
    @Override
    public float[] bogieLengthFromCenter() {
        return new float[]{1.5f, -1.5f};
    }

    @Override
    public float getRenderScale() {
        return 0.0625f;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{0f, -0F, 0.F}};
    }

    @Override
    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/passengerstock/CPMetalVan/CP_Metal_Van_Script.png",
                "textures/bogies/70ton_swing_motion_truck.png",
                "Cp Script", "Canadian Pacific in script with end searchlight");
    }

    /*@Override
    public String getDefaultSkin() {
        return "";
    }*/

    @Override
    public ItemStack[] getRecipe() {
        return new ItemStack[]{
                DefineStack(Items.bed, 1), null, null,
                null, null, null,
                null, null, null
        };
    }

    /**
     * <h2>Inventory Size</h2>
     */
    @Override
    public int getInventoryRows() {
        return 0;
    }

    /**
     * <h2>Type</h2>
     */

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.PASSENGER;
    }

    /**
     * <h2>Rider offsets</h2>
     */
    @Override
    public float[][] getRiderOffsets() {
        return new float[][]{{1f, 1.45f, -0.3f}};
    }


    @Override
    public float[] getHitboxSize() {
        return new float[]{5.05f, 2f, 1.5f};
    }

    @Override
    public float getPistonOffset() {
        return 0;
    }

    @Override
    public ModelBase[] getModel() {
        return new ModelBase[]{new CPMetalVan()};
    }

    /**
     * <h2>pre-asigned values</h2>
     */
    @Override
    public Item getItem() {
        return thisItem;
    }
}

