package xp.demo.codesmell.duplidatecode.acrossclasses;

import java.io.OutputStream;

public class AddEmployeeCmd {
    private String name;
    private String address;
    private String city;
    private String state;
    private String annualSalary;
    protected static final byte[] header = { (byte) 0xde, (byte) 0xad };
    protected static final byte[] commandChar = { 0x01 };
    protected static final byte[] footer = { (byte) 0xbe, (byte) 0xef };
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;

    public AddEmployeeCmd(String name, String address, String city,
                          String state, String annualSalary) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.annualSalary = annualSalary;
    }

    public void write(OutputStream outputStream) throws Exception {
        outputStream.write(header);
        // calculate and write size of the content
        outputStream
                .write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH
                        + footer.length + name.getBytes().length + 1
                        + address.getBytes().length + 1
                        + city.getBytes().length + 1 + state.getBytes().length
                        + 1 + annualSalary.getBytes().length + 1));
        outputStream.write(commandChar);

        outputStream.write(name.getBytes());
        outputStream.write(0x00);
        outputStream.write(address.getBytes());
        outputStream.write(0x00);
        outputStream.write(city.getBytes());
        outputStream.write(0x00);
        outputStream.write(state.getBytes());
        outputStream.write(0x00);
        outputStream.write(annualSalary.getBytes());
        outputStream.write(0x00);
        outputStream.write(footer);
    }

}
