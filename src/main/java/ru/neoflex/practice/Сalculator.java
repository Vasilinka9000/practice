package ru.neoflex.practice;
import jakarta.persistence.*;

@Entity
@Table(name = "сalculator")
public class Сalculator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "summandOne")
    private int summandOne;

    @Column(name = "summandTwo")
    private int summandTwo;

    @Column(name = "result")
    private long result;

    @Column(name = "calcOperator")
    private СalculatorOperator calcOperator;

    public Сalculator() {}

    public Сalculator(int summandOne, int summandTwo, long result, СalculatorOperator calcOperator) {
        this.summandOne = summandOne;
        this.summandTwo = summandTwo;
        this.result = result;
        this.calcOperator = calcOperator;
    }
    public long getId() {
        return id;
    }
    public int getSummandOne() {
        return summandOne;
    }
    public int getSummandTwo() {
        return summandTwo;
    }
    public СalculatorOperator getCalcOperator() {
        return calcOperator;
    }
}