package org.binsh.mckotlinplugin.commands

import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class HelloCommand : CommandExecutor {
    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            sender.sendMessage("Hello, ${sender.name}!")
        } else {
            sender.sendMessage("This command can only be run by a player.")
        }
        return true
    }
}