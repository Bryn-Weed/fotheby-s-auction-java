/*
 * drawings.java
 *
 * Generated with Matisse Schema Definition Language 9.1.9
 * Generation date: Sat Apr 21 17:28:07 2018
 */

// Note: the package and extends declarations are generated by mt_sdl, do not modify them

import com.matisse.reflect.*;

/**
 * <code>drawings</code> is a schema class generated by <code>mt_sdl</code>.
 * Any user-written classes will be found at the end of the file, after
 * the '// END of Matisse SDL Generated Code' comment.
 * Attribute types, default values, and relationship minimum and maximum
 * cardinality are stored in the database itself, not in this source code.
 * For more information, see <i>Getting Started with MATISSE</i>.
 */
public class drawings extends com.matisse.reflect.MtObject {

    // BEGIN Matisse SDL Generated Code
    // DO NOT MODIFY UNTIL THE 'END of Matisse SDL Generated Code' MARK BELOW
    /*
     * Generated with Matisse Schema Definition Language 9.1.9
     * Generation Date: Sat Apr 21 17:28:07 2018
     */

    /*
     * Class variables and methods
     */

    /** Class <code>drawings</code> cache ID */
    private static int CID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtClass.Loader("drawings"));

    /**
     * Gets the <code>drawings</code> class descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db a database
     * @return a class descriptor
     */
    public static com.matisse.reflect.MtClass getClass(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtClass)db.getCachedObject(CID);
    }

    /**
     * Factory constructor. This constructor is called by <code>MtObjectFactory</code>.
     * It is public for technical reasons but is not intended to be called
     * directly by user methods.
     * @param db a database
     * @param mtOid an existing object ID in the database
     */
    public drawings(com.matisse.MtDatabase db, int mtOid)  {
        super(db, mtOid);
    }

    /**
     * Cascaded constructor, used by subclasses to create a new object in the database.
     * It is protected for technical reasons but is not intended to be called
     * directly by user methods.
     * @param mtCls a class descriptor (the class to instantiate)
     */
    protected drawings(com.matisse.reflect.MtClass mtCls)  {
        super(mtCls);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>instanceIterator(drawings.class);
    }

    /**
     * Opens an iterator on all instances of this class (and its subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> instanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>instanceIterator(numObjPerBuffer, drawings.class);
    }

    /**
     * Counts the number of instances of this class (and its subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getInstanceNumber();
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db) {
        return getClass(db).<E>ownInstanceIterator(drawings.class);
    }

    /**
     * Opens an iterator on all own instances of this class (excluding subclasses).
     * @param <E> a MtObject class     * @param db a database
     * @param numObjPerBuffer maximum number of objects to fetch from the server at a time
     * @return an object iterator
     */
    public static <E extends com.matisse.reflect.MtObject> com.matisse.MtObjectIterator<E> ownInstanceIterator(com.matisse.MtDatabase db, int numObjPerBuffer) {
        return getClass(db).<E>ownInstanceIterator(numObjPerBuffer, drawings.class);
    }

    /**
     * Counts the number of own instances of this class (excluding subclasses).
     * @param db a database
     * @return total number of instances
     */
    public static long getOwnInstanceNumber(com.matisse.MtDatabase db) {
        return getClass(db).getOwnInstanceNumber();
    }

    /*
     * Attribute access methods
     */

    /* Attribute 'toolUsed' */

    /** Attribute <code>toolUsed</code> cache ID */
    private static int toolUsedCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("toolUsed",CID));

    /**
     * Gets the <code>toolUsed</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getToolUsedAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(toolUsedCID);
    }


    /**
     * Gets the <code>toolUsed</code> attribute value.
     * @return the value
     *
     * @see #setToolUsed
     * @see #removeToolUsed
     */
    public final String getToolUsed() {
        return getString(getToolUsedAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>toolUsed</code> attribute value.
     * @param val the new value
     *
     * @see #getToolUsed
     * @see #removeToolUsed
     */
    public final void setToolUsed(String val) {
        setString(getToolUsedAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>toolUsed</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getToolUsed
     * @see #setToolUsed
     */
    public final void removeToolUsed() {
        removeValue(getToolUsedAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getToolUsed
     * @see #setToolUsed
     */
    public final boolean isToolUsedDefaultValue() {
        return isDefaultValue(getToolUsedAttribute(getMtDatabase()));
    }


    /* Attribute 'framed' */

    /** Attribute <code>framed</code> cache ID */
    private static int framedCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("framed",CID));

    /**
     * Gets the <code>framed</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getFramedAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(framedCID);
    }


    /**
     * Gets the <code>framed</code> attribute value.
     * @return the value
     *
     * @see #setFramed
     * @see #removeFramed
     */
    public final String getFramed() {
        return getString(getFramedAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>framed</code> attribute value.
     * @param val the new value
     *
     * @see #getFramed
     * @see #removeFramed
     */
    public final void setFramed(String val) {
        setString(getFramedAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>framed</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getFramed
     * @see #setFramed
     */
    public final void removeFramed() {
        removeValue(getFramedAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getFramed
     * @see #setFramed
     */
    public final boolean isFramedDefaultValue() {
        return isDefaultValue(getFramedAttribute(getMtDatabase()));
    }


    /* Attribute 'dimensionHeight' */

    /** Attribute <code>dimensionHeight</code> cache ID */
    private static int dimensionHeightCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("dimensionHeight",CID));

    /**
     * Gets the <code>dimensionHeight</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDimensionHeightAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(dimensionHeightCID);
    }


    /**
     * Gets the <code>dimensionHeight</code> attribute value.
     * @return the value
     *
     * @see #setDimensionHeight
     * @see #removeDimensionHeight
     */
    public final int getDimensionHeight() {
        return getInteger(getDimensionHeightAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>dimensionHeight</code> attribute value.
     * @param val the new value
     *
     * @see #getDimensionHeight
     * @see #removeDimensionHeight
     */
    public final void setDimensionHeight(int val) {
        setInteger(getDimensionHeightAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>dimensionHeight</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDimensionHeight
     * @see #setDimensionHeight
     */
    public final void removeDimensionHeight() {
        removeValue(getDimensionHeightAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDimensionHeight
     * @see #setDimensionHeight
     */
    public final boolean isDimensionHeightDefaultValue() {
        return isDefaultValue(getDimensionHeightAttribute(getMtDatabase()));
    }


    /* Attribute 'dimensionLength' */

    /** Attribute <code>dimensionLength</code> cache ID */
    private static int dimensionLengthCID = com.matisse.MtDatabase.allocCID(new com.matisse.reflect.MtAttribute.Loader("dimensionLength",CID));

    /**
     * Gets the <code>dimensionLength</code> attribute descriptor.
     * This method supports advanced MATISSE programming techniques such as
     * dynamically modifying the schema.
     * @param db the database containing the attribute
     * @return the attribute descriptor object
     */
    public static com.matisse.reflect.MtAttribute getDimensionLengthAttribute(com.matisse.MtDatabase db) {
        return (com.matisse.reflect.MtAttribute)db.getCachedObject(dimensionLengthCID);
    }


    /**
     * Gets the <code>dimensionLength</code> attribute value.
     * @return the value
     *
     * @see #setDimensionLength
     * @see #removeDimensionLength
     */
    public final int getDimensionLength() {
        return getInteger(getDimensionLengthAttribute(getMtDatabase()));
    }

    /**
     * Sets the <code>dimensionLength</code> attribute value.
     * @param val the new value
     *
     * @see #getDimensionLength
     * @see #removeDimensionLength
     */
    public final void setDimensionLength(int val) {
        setInteger(getDimensionLengthAttribute(getMtDatabase()), val);
    }

    /**
     * Removes the current <code>dimensionLength</code> attribute value.
     * Falls back to the default value is there is one.  If the attribute
     * has no default value, it must be set to a new value before commit.
     *
     * @see #getDimensionLength
     * @see #setDimensionLength
     */
    public final void removeDimensionLength() {
        removeValue(getDimensionLengthAttribute(getMtDatabase()));
    }

    /**
     * Check if attribute value is set to its default value.
     * @return true if default value
     *
     * @see #getDimensionLength
     * @see #setDimensionLength
     */
    public final boolean isDimensionLengthDefaultValue() {
        return isDefaultValue(getDimensionLengthAttribute(getMtDatabase()));
    }


    // END of Matisse SDL Generated Code

    /*
     * You may add your own code here...
     */

    /**
     * Default constructor provided as an example.
     * You may delete this constructor or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @param db a database
     */
    public drawings(com.matisse.MtDatabase db) {
        super(getClass(db));
    }

    /**
     * Example of <code>toString</code> method.
     * You may delete this method or modify it to suit your needs. If you
     * modify it, please revise this comment accordingly.
     * @return a string
     */
    public java.lang.String toString() {
        return super.toString() + "[drawings]";
    }
}
