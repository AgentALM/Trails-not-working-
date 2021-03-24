package me.Sabu.trailsgui;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import me.Sabu.trailsgui.commands.Trail;
import me.Sabu.trailsgui.events.ClickEvent;
import me.Sabu.trailsgui.models.GUI;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		GUI menu = new GUI();
		menu.register();
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new ClickEvent(), this);
		
		this.getCommand("trails").setExecutor(new Trail());
	}
	
	@Override
	public void onDisable() {
		
		
	}
	
}
