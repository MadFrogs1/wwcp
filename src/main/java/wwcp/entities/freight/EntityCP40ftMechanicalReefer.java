package wwcp.entities.freight;

import ebf.tim.TrainsInMotion;
import ebf.tim.api.SkinRegistry;
import ebf.tim.entities.GenericRailTransport;
import ebf.tim.utility.RailUtility;
import fexcraft.tmt.slim.ModelBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import wwcp.entities.EntityDataSets.Transport;
import wwcp.entities.WWCPTransport;
import wwcp.models.bogies.AmericanTrucks.truck_70ton;
import wwcp.models.freight.CP40ftMechanicalReefer;
import wwcp.models.freight.CP40ftMechanicalReefer;
import wwcp.worldwidecontentpack;

import java.util.UUID;

public class EntityCP40ftMechanicalReefer extends GenericRailTransport {

    public static final String[] itemDescription = new String[]{"§7" + StatCollector.translateToLocal("menu.item.weight") + ": 2" + StatCollector.translateToLocal("menu.item.tons"), "§7" + StatCollector.translateToLocal("menu.item.sizeof") + ": 27" + StatCollector.translateToLocal("menu.item.slots")};

    public static final Item thisItem = new WWCPTransport(new EntityCP40ftMechanicalReefer((World)null), worldwidecontentpack.MODID, worldwidecontentpack.America);

    public EntityCP40ftMechanicalReefer(UUID owner, World world, double xPos, double yPos, double zPos) {super(owner, world, xPos, yPos, zPos);
    }

    public EntityCP40ftMechanicalReefer(World world) {
        super(world);
    }

    @Override
    public float[][] bogieModelOffsets() {
        return new float[][]{{1.90f,0.0f,0},{-2.1f,0.0f,0}};
    }

    @Override
    public ModelBase[] bogieModels() {
        return new ModelBase[]{new truck_70ton()};
    }

    public float[] bogieLengthFromCenter() {
        return new float[]{2.0F, -2.0F};
    }

    public float getRenderScale() {
        return 0.0625F;
    }

    @Override
    public float[][] modelOffsets() {
        return new float[][]{{-0F,0.0F,0F}};
    }

    public void registerSkins() {
        SkinRegistry.addSkin(this.getClass(), worldwidecontentpack.MODID, "textures/freightskins/CP40ftMechanicalReefer/40ft_Mechanical_Refrigerator_CP.png",
                "textures/bogies/70ton_truck_black.png",
                "CP Reefer Script", "CP Script painted in reefer white w/ plugdoor");
    }

    @Override
    public String transportFuelType() {
        return null;
    }

    public boolean isReinforced() {
        return Transport.CP_Mechanical_Reefer_40ft().reinforced;
    }

    public float weightKg() {
        return Transport.CP_Mechanical_Reefer_40ft().weightinKGs;
    }

    public ItemStack[] getRecipe() {
        return new ItemStack[]{RailUtility.DefineStack(Blocks.iron_ore, 1), null, null, null, null, null, null, null, null};
    }

    public String transportName() {
        return Transport.CP_Mechanical_Reefer_40ft().name;
    }

    public String transportcountry() { return Transport.CP_Mechanical_Reefer_40ft().country; }

    public String transportYear() { return Transport.CP_Mechanical_Reefer_40ft().year; }

    public float transportTopSpeed() {
        return Transport.CP_Mechanical_Reefer_40ft().topSpeed;
    }

    public boolean isFictional() {
        return Transport.CP_Mechanical_Reefer_40ft().fictional;
    }

    @Override
    public String[] additionalItemText() {
        {return new String[]{RailUtility.translate(Transport.CP_Mechanical_Reefer_40ft().additionalTextTitle) + Transport.CP_Mechanical_Reefer_40ft().additionalText,
                RailUtility.translate(Transport.CP_Mechanical_Reefer_40ft().additionalTextTitle2) + Transport.CP_Mechanical_Reefer_40ft().additionalText2};}
    }
    public int getInventoryRows() {
        return Transport.CP_Mechanical_Reefer_40ft().rows;
    }

    public TrainsInMotion.transportTypes getType() {
        return TrainsInMotion.transportTypes.FREIGHT;
    }

    public float[][] getRiderOffsets() {
        return null;
    }

    public float[] getHitboxSize() {
        return new float[]{5.9f, 2f, 1.6F};
    }

    public float getPistonOffset() {
        return 0.0F;
    }

    public ModelBase[] getModel() {
        return new ModelBase[]{new CP40ftMechanicalReefer()};
    }

    public Item getItem() {
        return thisItem;
    }


}

