package me.Sabu.trailsgui.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;

import me.Sabu.trailsgui.models.Effects;
import me.Sabu.trailsgui.models.GUI;
import me.Sabu.trailsgui.models.ParticalData;

public class ClickEvent implements Listener {

	private GUI menu; 
	public ClickEvent() {
		menu = new GUI();
		
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent event) {
		if (!event.getInventory().equals(menu.getInventory()))
			return;
		
		Player player = (Player) event.getWhoClicked();
		event.setCancelled(true);
		
		if (event.getView().getType() == InventoryType.PLAYER)
			return;
		
		ParticalData particle = new ParticalData(player.getUniqueId());
		
		if(particle.hasID()) {
			particle.endTask();
			particle.removeID();
		}
		
		Effects trails = new Effects(player);
		
		switch(event.getSlot()) {
		case 3:
			trails.startTotem();
			player.closeInventory();
			player.updateInventory();
			break;
		case 5:
			break;
		default:
			break;
		
		}
	}
}
