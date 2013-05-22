package enhancedportals.client.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import enhancedportals.lib.ItemIds;
import enhancedportals.lib.Textures;
import enhancedportals.tileentity.TileEntityPortalModifier;

public class GuiPortalModifierSlot extends Slot
{
    TileEntityPortalModifier portalModifier;

    public GuiPortalModifierSlot(TileEntityPortalModifier portalmodifier, int par2, int par3, int par4)
    {
        super(portalmodifier, par2, par3, par4);
        portalModifier = portalmodifier;
    }

    @Override
    public boolean canTakeStack(EntityPlayer par1EntityPlayer)
    {
        return true;
    }

    @Override
    public int getSlotStackLimit()
    {
        return 1;
    }

    @Override
    public boolean isItemValid(ItemStack itemStack)
    {
        return itemStack.itemID == ItemIds.PortalModifierUpgrade + 256 || Textures.getTextureFromItemStack(itemStack) != null;
    }
}
