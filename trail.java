package me.Sabu.trailsgui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Sabu.trailsgui.models.GUI;

public class Trail implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] Aray) {
	if (label.equalsIgnoreCase("trails")) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Hey! You can not do that");
			return true;
			
			
			
		}
		Player player = (Player) sender;
		GUI menu = new GUI();
		menu.openInventory(player);
		return true;
		
	}
	return false;
	
}
}
