package ljdp.minechem.common.items;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class ItemFusionStar extends Item {

    public ItemFusionStar(int id) {
        super(id);
        setMaxStackSize(1);
        this.setMaxDamage(2000);
        this.setNoRepair();
        this.setUnlocalizedName("name.fusionStar");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean par4) {
	    int damage = itemStack.getItemDamage();
        int usesLeft = damage - 2000;
		int percentFinal = usesLeft / 2000;
        list.add(percentFinal + " % Remaining ");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int par1) {
        return Item.netherStar.getIconFromDamage(par1);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return false;
    }

}
