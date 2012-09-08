package com.github.rhinointhechinashop.limitlava;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class LimitLava extends JavaPlugin {
	@Override
	public void onEnable() {
		getLogger().log(Level.INFO, "LimitLava plugin enabled.");
	}
	@Override
	public void onDisable() {
		getLogger().log(Level.INFO, "LimitLava plugin disabled.");
	}
}
