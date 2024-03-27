package com.product.calculatorfuture.model;

import jakarta.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "calculator")
public class Calculator {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private List<Integer> agr;
    @Column
    private Integer sum;
    @Column Integer numOne;
    @Column Integer numTwo;
    @Column Integer numThree;
    @Column
    private Integer multiply;
    @Column
    private Integer multiplySum;
    @Column
    private Integer minus;

    public Calculator() {
    }
    public Calculator(List<Integer> agr, Integer sum, Integer multiply,
                      Integer multiplySum, Integer minus) {
        this.agr = agr;
        this.sum = sum;
        this.multiply = multiply;
        this.multiplySum = multiplySum;
        this.minus = minus;
    }


    public Calculator(Integer numOne, Integer numTwo, Integer numThree) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.numThree = numThree;
    }

    public Integer getNumOne() {
        return numOne;
    }

    public void setNumOne(Integer numOne) {
        this.numOne = numOne;
    }

    public Integer getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(Integer numTwo) {
        this.numTwo = numTwo;
    }

    public Integer getNumThree() {
        return numThree;
    }

    public void setNumThree(Integer numThree) {
        this.numThree = numThree;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calculator(List<Integer> agr) {
        this.agr = agr;
    }

    public List<Integer> getAgr() {
        return agr;
    }

    public void setAgr(List<Integer> agr) {
        this.agr = agr;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getMultiply() {
        return multiply;
    }

    public void setMultiply(Integer multiply) {
        this.multiply = multiply;
    }

    public Integer getMultiplySum() {
        return multiplySum;
    }

    public void setMultiplySum(Integer multiplySum) {
        this.multiplySum = multiplySum;
    }

    public Integer getMinus() {
        return minus;
    }

    public void setMinus(Integer minus) {
        this.minus = minus;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "id=" + id +
                ", agr=" + agr +
                ", sum=" + sum +
                ", multiply=" + multiply +
                ", multiplySum=" + multiplySum +
                ", minus=" + minus +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return Objects.equals(id, that.id) && Objects.equals(agr, that.agr) && Objects.equals(sum, that.sum) && Objects.equals(multiply, that.multiply) && Objects.equals(multiplySum, that.multiplySum) && Objects.equals(minus, that.minus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agr, sum, multiply, multiplySum, minus);
    }
}
