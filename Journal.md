# Journal
#### In your own words, why is LIFO (Last-In, First-Out) the correct data structure behavior for an undo mechanism compared to FIFO (First-In, First-Out)?
LIFO is the correct behavior for an undo mechanism because it ensures that the last action that you did is the first one that is undone which is what undo is supposed to do while in FIFO you wouldn't be able to go backward because it would erase all your previous steps before getting to your current ones.

### What happens if a user calls undo() when no changes have been made yet? How did you handle this edge case in your code?
Because I set my initial value to an empty string if the user tries to call undo they would just get an empty string back instead of an error exception code.

### Why must the redoStack be cleared whenever a user makes a brand-new change instead of continuing to type?
The redoStack has to be cleared whenever a user makes a brand-new change because if it isn't then when your original code branches off to something other then the first version the redo will be stuck on the first version that they wrote.