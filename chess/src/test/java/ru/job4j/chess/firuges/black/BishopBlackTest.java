package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void TestPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Cell rsl = bishopBlack.position();
        assertThat(rsl, is(Cell.A2));
    }

    @Test
    public void TestCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A2);
        Figure bishopB = bishopBlack.copy(Cell.A6);
        assertThat(bishopB.position(), is(Cell.A6));
    }

    @Test
    public void TestWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] cells = bishopBlack.way(Cell.G5);
        Assert.assertArrayEquals(cells, new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5});
    }

    @Test
    public void isDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(bishopBlack.position(), Cell.G5);
        assertThat(rsl, is(true));

    }





}