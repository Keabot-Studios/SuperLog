package net.keabotstudios.superlog;

public class Logger {

	public enum LogLevel {
		INFO(0), DEBUG(1), ERROR(2), FATAL(3), NONE(Integer.MAX_VALUE);

		int level;

		private LogLevel(int l) {
			level = l;
		}

		public int getLevel() {
			return level;
		}
	}
	private LogLevel logLevel = LogLevel.FATAL;

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	private void log(LogLevel l, String s) {
		if (l.level >= logLevel.level)
			System.out.print("[" + l.name() + "]" + s);
	}
	
	private void logLn(LogLevel l, String s) {
		if (l.level >= logLevel.level)
			System.out.println("[" + l.name() + "]" + s);
	}

	public void infoLn(String s) {
		logLn(LogLevel.INFO, s);
	}

	public void debugLn(String s) {
		logLn(LogLevel.DEBUG, s);
	}

	public void errorLn(String s) {
		logLn(LogLevel.ERROR, s);
	}

	public void fatalLn(String s) {
		logLn(LogLevel.FATAL, s);
	}
	
	public void infoLn() {
		logLn(LogLevel.INFO, "");
	}

	public void debugLn() {
		logLn(LogLevel.DEBUG, "");
	}

	public void errorLn() {
		logLn(LogLevel.ERROR, "");
	}

	public void fatalLn() {
		logLn(LogLevel.FATAL, "");
	}
	
	public void info(String s) {
		log(LogLevel.INFO, s);
	}

	public void debug(String s) {
		log(LogLevel.DEBUG, s);
	}

	public void error(String s) {
		log(LogLevel.ERROR, s);
	}

	public void fatal(String s) {
		log(LogLevel.FATAL, s);
	}

}