package aquarius0715.dice;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Random;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("dice").setExecutor(new Dice());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


}
