package bagpacker.commands;

import java.util.ArrayList;
import bagpacker.packingfunc.PackingList;

public class DeleteListCommand extends Command {

    @Override
    public void execute(PackingList packingList) {
        packingList.clear();
    }

}
