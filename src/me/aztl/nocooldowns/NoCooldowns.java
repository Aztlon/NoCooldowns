package me.aztl.nocooldowns;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import com.projectkorra.projectkorra.event.PlayerCooldownChangeEvent;
import com.projectkorra.projectkorra.event.PlayerCooldownChangeEvent.Result;

public class NoCooldowns extends JavaPlugin implements Listener {

	@Override
	public void onEnable() {
		getServer().getLogger().info("NoCooldowns " + version() + " by " + dev() + " has been enabled.");
		getServer().getPluginManager().registerEvents(this, this);
	}
	
	@Override
	public void onDisable() {
		getServer().getLogger().info("NoCooldowns " + version() + " by " + dev() + " has been disabled.");
	}
	
	@EventHandler
	public void onPKCooldown(PlayerCooldownChangeEvent event) {
		if (event.getResult() == Result.ADDED) {
			event.setCancelled(true);
			return;
		}
	}
	
	public String version() {
		return "1.0.0";
	}
	
	public String dev() {
		return "Aztl";
	}
	
}
