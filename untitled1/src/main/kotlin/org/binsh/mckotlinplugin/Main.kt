package org.binsh.mckotlinplugin

import org.binsh.mckotlinplugin.commands.HelloCommand
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {
    override fun onEnable() {
        logger.info("플러그인 정상 작동 확인!!!")

        // 명령어 등록
        val command = getCommand("hello")
        if (command != null) {
            command.setExecutor(HelloCommand())
            logger.info("'hello' 명령어가 성공적으로 등록되었습니다.")
        } else {
            logger.warning("'hello' 명령어를 찾을 수 없습니다. paper-plugin.yml 파일을 확인해주세요.")
        }

        //getCommand("hello")?.setExecutor(HelloCommand())
    }

    override fun onDisable() {
        logger.info("플러그인 정상 종료 확인!!!")
    }
}