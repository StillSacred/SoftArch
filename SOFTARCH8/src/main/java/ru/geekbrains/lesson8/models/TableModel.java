package ru.geekbrains.lesson8.models;

import ru.geekbrains.lesson8.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Ошибка бронирования столика. Повторите попытку позже.");
    }

    /**
     * TODO: Доработать самостоятельнов рамках домашней работы
     * @param oldReservation номер старой брони
     * @param reservationDate дата брони
     * @param tableNo номер столика
     * @param name имя клиента
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        boolean isRemoved = false;
        for (Table table : tables) {
            Collection<Reservation> reservations = table.getReservations();
            if (reservations != null) {
                for (Reservation reservation : reservations) {
                    if (reservation.getId() == oldReservation) {
                        table.getReservations().remove(reservation);
                        isRemoved = true;
                        break;
                    }
                }
            }
            if (isRemoved) break;
        }
        if (!isRemoved) throw new RuntimeException("Бронь не найдена.");
        return reservationTable(reservationDate, tableNo, name);
    }
}