// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.2.0.0

package proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import proto.*;

// Fast Binary Encoding Balance final model
public final class FinalModelBalance extends FinalModel
{
    public final FinalModelString currency;
    public final FinalModelDouble amount;

    public FinalModelBalance(Buffer buffer, long offset)
    {
        super(buffer, offset);
        currency = new FinalModelString(buffer, 0);
        amount = new FinalModelDouble(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(Balance fbeValue)
    {
        long fbeResult = 0
            + currency.fbeAllocationSize(fbeValue.currency)
            + amount.fbeAllocationSize(fbeValue.amount)
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 2;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        currency.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = currency.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        amount.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = amount.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public Balance get(Size fbeSize) { return get(fbeSize, new Balance()); }
    public Balance get(Size fbeSize, Balance fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(Balance fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        currency.fbeOffset(fbeCurrentOffset);
        fbeValue.currency = currency.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        amount.fbeOffset(fbeCurrentOffset);
        fbeValue.amount = amount.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(Balance fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(Balance fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        currency.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = currency.set(fbeValue.currency);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        amount.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = amount.set(fbeValue.amount);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
