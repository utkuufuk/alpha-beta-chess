## alpha-beta-chess
A nice looking and challenging chess game based on Eclipse RCP.

![Alpha-Beta Chess](chess.png)

### Controls
 * Double-click on a piece you control. This highlights the squares that the piece is allowed to move.
 * Left-click one of the highlighted squares to move the selected piece. Now it's the AI's turn.
 * Wait until the AI makes a move for a few seconds.

### AI Player
 * Makes its moves according to the alpha-beta pruning algorithm reinforced with iterative deepening.
 * Has a fixed amount of time to make a move each turn. 
 * Starts with a search depth of 5. Constantly increments the depth and restarts the search as long as there is time remaining.
 * Remembers the best move it found on the previous search. If time runs out during the current search, makes that move immediately. 
 
#### Target Platform Settings In Linux
In Eclipse go to `Window->Plug-in Development->Target Platform->Add` and select *Default*.
