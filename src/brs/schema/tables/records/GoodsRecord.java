/*
 * This file is generated by jOOQ.
*/
package brs.schema.tables.records;


import brs.schema.tables.Goods;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GoodsRecord extends UpdatableRecordImpl<GoodsRecord> implements Record12<Long, Long, Long, String, String, String, Integer, Integer, Long, Boolean, Integer, Boolean> {

    private static final long serialVersionUID = -281912380;

    /**
     * Setter for <code>DB.goods.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.goods.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.goods.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.goods.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.goods.seller_id</code>.
     */
    public void setSellerId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.goods.seller_id</code>.
     */
    public Long getSellerId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>DB.goods.name</code>.
     */
    public void setName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.goods.name</code>.
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>DB.goods.description</code>.
     */
    public void setDescription(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.goods.description</code>.
     */
    public String getDescription() {
        return (String) get(4);
    }

    /**
     * Setter for <code>DB.goods.tags</code>.
     */
    public void setTags(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.goods.tags</code>.
     */
    public String getTags() {
        return (String) get(5);
    }

    /**
     * Setter for <code>DB.goods.timestamp</code>.
     */
    public void setTimestamp(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>DB.goods.timestamp</code>.
     */
    public Integer getTimestamp() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>DB.goods.quantity</code>.
     */
    public void setQuantity(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>DB.goods.quantity</code>.
     */
    public Integer getQuantity() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>DB.goods.price</code>.
     */
    public void setPrice(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>DB.goods.price</code>.
     */
    public Long getPrice() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>DB.goods.delisted</code>.
     */
    public void setDelisted(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>DB.goods.delisted</code>.
     */
    public Boolean getDelisted() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>DB.goods.height</code>.
     */
    public void setHeight(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>DB.goods.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>DB.goods.latest</code>.
     */
    public void setLatest(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>DB.goods.latest</code>.
     */
    public Boolean getLatest() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Long, String, String, String, Integer, Integer, Long, Boolean, Integer, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Long, Long, Long, String, String, String, Integer, Integer, Long, Boolean, Integer, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Goods.GOODS.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Goods.GOODS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Goods.GOODS.SELLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Goods.GOODS.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Goods.GOODS.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Goods.GOODS.TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Goods.GOODS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Goods.GOODS.QUANTITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Goods.GOODS.PRICE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Goods.GOODS.DELISTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Goods.GOODS.HEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Goods.GOODS.LATEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getSellerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getDelisted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getSellerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTags();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getQuantity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getPrice();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getDelisted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getHeight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getLatest();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value2(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value3(Long value) {
        setSellerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value4(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value5(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value6(String value) {
        setTags(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value7(Integer value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value8(Integer value) {
        setQuantity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value9(Long value) {
        setPrice(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value10(Boolean value) {
        setDelisted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value11(Integer value) {
        setHeight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord value12(Boolean value) {
        setLatest(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GoodsRecord values(Long value1, Long value2, Long value3, String value4, String value5, String value6, Integer value7, Integer value8, Long value9, Boolean value10, Integer value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GoodsRecord
     */
    public GoodsRecord() {
        super(Goods.GOODS);
    }

    /**
     * Create a detached, initialised GoodsRecord
     */
    public GoodsRecord(Long dbId, Long id, Long sellerId, String name, String description, String tags, Integer timestamp, Integer quantity, Long price, Boolean delisted, Integer height, Boolean latest) {
        super(Goods.GOODS);

        set(0, dbId);
        set(1, id);
        set(2, sellerId);
        set(3, name);
        set(4, description);
        set(5, tags);
        set(6, timestamp);
        set(7, quantity);
        set(8, price);
        set(9, delisted);
        set(10, height);
        set(11, latest);
    }
}
