package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void moveThrowImpossibleMoveException()
                throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C1, Cell.C2);

    }

    @Test(expected = FigureNotFoundException.class)
    public void moveThrowFigureNotFoundException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.move(Cell.C3, Cell.C2);

    }

    @Test(expected = OccupiedCellException.class)
    public void moveThrowOccupiedCellException()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException{
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new KingBlack(Cell.D2));
        logic.move(Cell.C1, Cell.E3);

    }


}