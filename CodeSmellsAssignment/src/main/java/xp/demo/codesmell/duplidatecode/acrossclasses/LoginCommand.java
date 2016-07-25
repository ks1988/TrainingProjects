package xp.demo.codesmell.duplidatecode.acrossclasses;

import java.io.OutputStream;

public class LoginCommand {

	private String userName;
	private String passwd;

    protected static final byte[] header = { (byte) 0xde, (byte) 0xad };
    protected static final byte[] commandChar = { 0x01 };
    protected static final byte[] footer = { (byte) 0xbe, (byte) 0xef };
    protected static final int SIZE_LENGTH = 1;
    protected static final int CMD_BYTE_LENGTH = 1;

    public LoginCommand(String userName, String passwd) {
		this.userName = userName;
		this.passwd = passwd;
	}

	public void write(OutputStream outputStream) throws Exception {
		outputStream.write(header);
		// calculate and write content size
		outputStream.write((header.length + SIZE_LENGTH + CMD_BYTE_LENGTH
				+ footer.length + userName.getBytes().length + 1
				+ passwd.getBytes().length + 1));
		outputStream.write(commandChar);
		outputStream.write(userName.getBytes());
		outputStream.write(0x00);
		outputStream.write(passwd.getBytes());
		outputStream.write(0x00);

		outputStream.write(footer);

	}
}
