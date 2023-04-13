package main.fcc;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class FastChestContent extends JavaPlugin {

    private static FastChestContent instance;

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getPluginManager().registerEvents(new BukkitEventHandler(), this);
        Objects.requireNonNull(getCommand("fcc")).setExecutor(new Commands());
    }

    private static final Map<String, Boolean> interactFlag = new HashMap<>();

    public static Map<String, Boolean> getInteractFlag() {
        return interactFlag;
    }

    public static FastChestContent getInstance() {
        return instance;
    }
}
