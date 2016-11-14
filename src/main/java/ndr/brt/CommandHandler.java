package ndr.brt;

public class CommandHandler {

    private GameEntity game = new GameEntity();
    private ScoreRepository scoreRepository = ScoreRepository.getInstance();

    public void handle(RollCommand command) {
        game.roll(command.getPins());

        scoreRepository.setScore(game.score());
    }

}