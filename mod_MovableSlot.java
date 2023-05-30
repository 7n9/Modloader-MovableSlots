package net.minecraft.src;

public class mod_MovableSlot extends BaseMod {

	public String Version() {
		return "v7.n.9";
	}
	
	private KeyBinding[] slotKeybinds = new KeyBinding[2];

	public mod_MovableSlot() {
		int i = 0;
			slotKeybinds[i] = new KeyBinding("SlotRight", 205);//right
		int l = 1	;
			slotKeybinds[l] = new KeyBinding("SlotLeft", 203);//left
			ModLoader.RegisterKey(this, slotKeybinds[i], false);
			ModLoader.RegisterKey(this, slotKeybinds[l], false);
	}
	
	public void KeyboardEvent(KeyBinding keybinding)
    {
		int i = 0;
		int l = 1	;
		if(slotKeybinds[i] == keybinding && ModLoader.isGUIOpen(null) && ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem < 9) {
			ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem ++;
		}
		if(slotKeybinds[i] == keybinding && ModLoader.isGUIOpen(null) && ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem == 9) {
			ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem = 0;
		}
		if(slotKeybinds[l] == keybinding && ModLoader.isGUIOpen(null) && ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem > -1) {
			ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem --;
		   }
		if(slotKeybinds[l] == keybinding && ModLoader.isGUIOpen(null) && ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem == -1) {
			ModLoader.getMinecraftInstance().thePlayer.inventory.currentItem = 8;
		   }
		}
    }

