// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

package com.chronoxor.proto.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import com.chronoxor.fbe.*;
import com.chronoxor.proto.*;

// Fast Binary Encoding com.chronoxor.proto proxy
public class Proxy extends com.chronoxor.fbe.Receiver
{
    // Proxy models accessors
    private final OrderModel OrderModel;
    private final BalanceModel BalanceModel;
    private final AccountModel AccountModel;

    public Proxy()
    {
        super(false);
        OrderModel = new OrderModel();
        BalanceModel = new BalanceModel();
        AccountModel = new AccountModel();
    }
    public Proxy(Buffer buffer)
    {
        super(buffer, false);
        OrderModel = new OrderModel();
        BalanceModel = new BalanceModel();
        AccountModel = new AccountModel();
    }

    // Proxy handlers
    protected void onProxy(OrderModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(BalanceModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(AccountModel model, long type, byte[] buffer, long offset, long size) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)com.chronoxor.proto.fbe.OrderModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                OrderModel.attach(buffer, offset);
                assert OrderModel.verify() : "proto.Order validation failed!";

                long fbeBegin = OrderModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(OrderModel, type, buffer, offset, size);
                OrderModel.model.getEnd(fbeBegin);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.BalanceModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                BalanceModel.attach(buffer, offset);
                assert BalanceModel.verify() : "proto.Balance validation failed!";

                long fbeBegin = BalanceModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(BalanceModel, type, buffer, offset, size);
                BalanceModel.model.getEnd(fbeBegin);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.AccountModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                AccountModel.attach(buffer, offset);
                assert AccountModel.verify() : "proto.Account validation failed!";

                long fbeBegin = AccountModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(AccountModel, type, buffer, offset, size);
                AccountModel.model.getEnd(fbeBegin);
                return true;
            }
        }

        return false;
    }
}