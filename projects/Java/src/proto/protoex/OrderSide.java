// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding

package protoex;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.charset.*;
import java.time.*;
import java.util.*;
import fbe.*;
import proto.*;

public final class OrderSide implements Comparable<OrderSide>
{
    public static final OrderSide buy = new OrderSide(OrderSideEnum.buy);
    public static final OrderSide sell = new OrderSide(OrderSideEnum.sell);
    public static final OrderSide tell = new OrderSide(OrderSideEnum.tell);

    private OrderSideEnum value = OrderSideEnum.values()[0];

    public OrderSide() {}
    public OrderSide(byte value) { setEnum(value); }
    public OrderSide(OrderSideEnum value) { setEnum(value); }
    public OrderSide(OrderSide value) { setEnum(value); }

    public OrderSideEnum getEnum() { return value; }
    public byte getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((byte)0); }

    public void setEnum(byte value) { this.value = OrderSideEnum.mapValue(value); }
    public void setEnum(OrderSideEnum value) { this.value = value; }
    public void setEnum(OrderSide value) { this.value = value.value; }

    @Override
    public int compareTo(OrderSide other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        if (!OrderSide.class.isAssignableFrom(obj.getClass()))
            return false;

        final OrderSide other = (OrderSide)obj;

        if ((value == null) || (other.value == null))
            return false;
        if (value.getRaw() != other.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}