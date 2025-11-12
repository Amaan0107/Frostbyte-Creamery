package com.pluralsight.util;

import com.pluralsight.models.MenuItem;
import java.io.File;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;

public class Receipt {
    private Order order;

    public Receipt(Order order) {
        this.order = order;
    }
}
