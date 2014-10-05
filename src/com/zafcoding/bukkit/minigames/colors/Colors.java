package com.zafcoding.bukkit.minigames.colors;

import org.bukkit.plugin.java.JavaPlugin;

public class Colors extends JavaPlugin{

	double version = 1.0;
	
	@Override
	public void onEnable() {
		System.out.println("Enableing Colors v." + version + "");
		System.out.println("Enabled Colors!");
	}
	
	@Override
	public void onDisable() {
		System.out.println("Disableing Colors v." + version + "");
		System.out.println("Disabled Colors!");
	}
	
}
