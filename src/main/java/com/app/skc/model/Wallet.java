package com.app.skc.model;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2020-02-05
 */
@TableName("skc_wallet")
@Data
public class Wallet extends Model<Wallet> {
    private static final long serialVersionUID = 1L;
    private String walletId;
    private String mnemonic;
    private String address;
    private String walletPath;
    private String publicKey;
    private String privateKey;
    private BigDecimal balance;
    private String walletType;
    private String userId;
    private Date createTime;
    private Date modifyTime;

    @Override
    protected Serializable pkVal() {
        return null;
    }
}
