package bagpacker.commands;

import bagpacker.iohandler.Ui;
import bagpacker.packingfunc.Item;
import bagpacker.packingfunc.PackingList;

public class AddCommand extends Commands {
    public static final String MSG_SUCCESS_ADD = "New item added: %s";
    public static final String MSG_USAGE_ADD = "add : Adds an item to the packing list.\n" +
                "Example: add toothbrush";

    private final Item item;

    public AddCommand(Item item) {
        this.item = item;
    }

    @Override
    public void execute(PackingList packingList, Ui ui) {
        this.packingList = packingList;
        packingList.addItem(item);
        Ui.printToUser(String.format(MSG_SUCCESS_ADD, item));
    }
}
