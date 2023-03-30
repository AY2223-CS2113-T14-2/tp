# User Guide

## Introduction

BagPacker is a tool that can help you keep track of your packing!

## Quick Start

{Give steps to get started quickly}

1. Ensure that you have Java 11 or above installed.
2. Down the latest version of `BagPacker` from [here](https://github.com/AY2223S2-CS2113-T14-2/tp).

## Features 

- Add
- Pack
- Unpack
- List
- Delete


### Adding a packing item: `add`
Adds a quantity of item(s) to the packing list.

Format: `add ITEM_QUANTITY /of ITEM_NAME`

* The `ITEM_QUANTITY` is a number that represents the amount of ITEM_NAME and should be a number greater than 0.
* The `ITEM_NAME` should be the name of the item to add to the packing list. 

Example of usage: 

`add 2 /of toothbrush`

`add 1 /of passport`

### Marking a quantity of item as packed: `pack`
Marks a quantity of item as 'packed' in the packing list.

Format: `pack ITEM_QUANTITY /of ITEM_INDEX`

* The `ITEM_QUANTITY` is a number that represents the quantity of the item at ITEM_INDEX to be marked at packed in the packing list and should be a number greater than 0 but less than the total quantity added.
* The `ITEM_INDEX` should be the index of the item in the packing list to mark as 'packed' to the packing list and should be a number than is within the size of the packing list.

Example of usage:

`pack 2 /of 3`

`pack 1 /of 5`

### Marking a quantity of item as unpacked: `unpack`
Marks a quantity of item as 'unpacked' in the packing list.

Format: `unpack ITEM_QUANTITY /of ITEM_INDEX`

* The `ITEM_QUANTITY` is a number that represents the quantity of the item at ITEM_INDEX to be marked at unpacked in the packing list and should be a number greater than 0 but less than the total quantity added.
* The `ITEM_INDEX` should be the index of the item in the packing list to mark as 'unpacked' to the packing list and should be a number than is within the size of the packing list.

Example of usage:

`unpack 2 /of 3`

`unpack 1 /of 5`

### Displaying all the items in the packing list: `list`
Display all the tasks currently in your packing list.

Format: `list`

Example of usage:

`list`

### Delete an item from the packing list: `delete`
Deletes an item from the packing list.

Format: `delete ITEM_INDEX`

* The `ITEM_INDEX` should be the index of the item in the packing list to delete and should be a number than is within the size of the packing list.


Example of usage:

`delete 1`

`delete 2`

## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: {your answer here}

## Command Summary

{Give a 'cheat sheet' of commands here}

* Add `add ITEM_QUANTITY /of ITEM_NAME`
* Pack `pack ITEM_QUANTITY /of ITEM_INDEX`
* Unpack `unpack ITEM_QUANTITY /of ITEM_INDEX`
* List `list`
* Delete `delete ITEM_INDEX`
