package org.example;

import cz.forestTech.addons.Addon;
import cz.forestTech.addons.AddonManager;
import cz.forestTech.spigot.Spigot;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Addon {

    private static Main instance;
    private AddonManager addonManager;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");
        System.out.println("TEST");
    }

    @Override
    public void onDisable() {

    }

    public static Main getInstance() {
        return instance;
    }


}