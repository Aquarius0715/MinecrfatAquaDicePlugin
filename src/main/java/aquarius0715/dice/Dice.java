package aquarius0715.dice;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class Dice implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("dice")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage("console gose flying");
                return true;
            }
            Player player = (Player) sender;
            //dice
            if (args.length == 0) {
                int r1 = new Random().nextInt(6 + 1);
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "サイコロを振って" + (r1 + 1) + "が出ました");
                return true;
            }
            //dice <number>
            if(args.length == 1) {
                Random random = new Random();
                int randomValue = random.nextInt(Integer.parseInt(args[0]));
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + Integer.parseInt(args[0]) + "面サイコロを振って、" + (randomValue + 1) + "が出ました");
                return true;
            }
                } else if(args.length == 1) {
            if(args[0].equalsIgnoreCase("help")) {
                Player player = (Player) sender;
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "==================AquaDiceHelp==================");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "/dice : 通常サイコロを振ります");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "/dice 振りたい番号 : 自分が振りたい面サイコロを振ります");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "/dice help : AquaDicePluginのヘルプを表示します");
                player.sendMessage(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "==================AquaDiceHelp==================");
            }
        }

            return false;
            }
        }

