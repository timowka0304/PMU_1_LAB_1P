package com.example.pmu_1_lab_1p;

/**
 * ПМУ - Лабораторная работа <b>1</b>
 * @autor Подгурский Тимофей
 * @version 8.1.4
 */
public class MinMaxFun {

    /**
     * Функция получает на вход два числа и возвращает из них большее
     *
     * @param a - 1 число
     * @param b - 2 число
     * @return возвращает большее из данных чисел
     */
    public int max(int a, int b)
    {
        return a > b ? a : b;
    }

    /**
     * Функция получает на вход два числа и возвращает из них меньшее
     *
     * @param a - 1 число
     * @param b - 2 число
     * @return возвращает меньшее из данных чисел
     */
    public int min(int a, int b)
    {
        return a > b ? b : a;
    }
}
