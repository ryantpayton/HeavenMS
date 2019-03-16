package client.command.commands.gm3;

import client.command.Command;
import client.MapleClient;
import net.server.Server;
import tools.MaplePacketCreator;

public class RipCommand extends Command {

    {
        setName("rip");
    }

    @Override
    public void execute(MapleClient c, String[] params) {
        //MapleCharacter player = c.getPlayer();
        Server.getInstance().broadcastMessage(c.getWorld(), MaplePacketCreator.serverNotice(6, "[RIP]: " + joinStringFrom(params, 1)));
    }
}
