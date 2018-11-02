package com.friendlyarm.FriendlyThings;

public class WatchDogEnum {
    /* include/uapi/linux/watchdog.h */
    public final static int WDIOC_GETSUPPORT = 0x80285700;
    public final static int WDIOC_GETSTATUS = 0x80045701;
    public final static int WDIOC_GETBOOTSTATUS = 0x80045702;
    public final static int WDIOC_GETTEMP = 0x80045703;
    public final static int WDIOC_SETOPTIONS = 0x80045704;
    public final static int WDIOC_KEEPALIVE = 0x80045705;
    public final static int WDIOC_SETTIMEOUT = 0xC0045706;
    public final static int WDIOC_GETTIMEOUT = 0x80045707;
    public final static int WDIOC_SETPRETIMEOUT = 0xC0045708;
    public final static int WDIOC_GETPRETIMEOUT = 0x80045709;
    public final static int WDIOC_GETTIMELEFT = 0x8004570A;

    public final static int WDIOF_UNKNOWN = -1;  /* Unknown flag error */
    public final static int WDIOS_UNKNOWN = -1;  /* Unknown status error */

    public final static int WDIOF_OVERHEAT = 0x0001;  /* Reset due to CPU overheat */
    public final static int WDIOF_FANFAULT = 0x0002;  /* Fan failed */
    public final static int WDIOF_EXTERN1 = 0x0004;  /* External relay 1 */
    public final static int WDIOF_EXTERN2 = 0x0008;  /* External relay 2 */
    public final static int WDIOF_POWERUNDER = 0x0010;  /* Power bad/power fault */
    public final static int WDIOF_CARDRESET = 0x0020;  /* Card previously reset the CPU */
    public final static int WDIOF_POWEROVER = 0x0040;  /* Power over voltage */
    public final static int WDIOF_SETTIMEOUT = 0x0080;  /* Set timeout (in seconds) */
    public final static int WDIOF_MAGICCLOSE = 0x0100;  /* Supports magic close char */
    public final static int WDIOF_PRETIMEOUT = 0x0200;  /* Pretimeout (in seconds), get/set */
    public final static int WDIOF_ALARMONLY = 0x0400;  /* Watchdog triggers a management or other external alarm not a reboot */
    public final static int WDIOF_KEEPALIVEPING = 0x8000;  /* Keep alive ping reply */

    public final static int WDIOS_DISABLECARD = 0x0001;  /* Turn off the watchdog timer */
    public final static int WDIOS_ENABLECARD = 0x0002;  /* Turn on the watchdog timer */
    public final static int WDIOS_TEMPPANIC = 0x0004;  /* Kernel panic on temperature trip */

}
