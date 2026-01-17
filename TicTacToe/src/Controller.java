public class Controller {

    TicTacToeService ticTacToeService;

    public Controller()
    {
        this.ticTacToeService = new TicTacToeService();
    }

    public void start() {
        ticTacToeService.initializeGame();
        ticTacToeService.startGame();

    }
}
