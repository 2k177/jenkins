# jenkins
## Cron jobs in declarative pipeline

To specify multiple values for one field, the following operators are available. In the order of precedence,

* specifies all valid values

M-N specifies a range of values

M-N/X or */X steps by intervals of X through the specified range or whole valid range

A,B,…​,Z enumerates multiple values

To allow periodically scheduled tasks to produce even load on the system, the symbol H (for “hash”) should be used wherever possible. For example, using 0 0 * * * for a dozen daily jobs will cause a large spike at midnight. In contrast, using H H * * * would still execute each job once a day, but not all at the same time, better using limited resources.

The H symbol can be used with a range. For example, H H(0-7) * * * means some time between 12:00 AM (midnight) to 7:59 AM.

 @yearly, @annually, @monthly, @weekly, @daily, @midnight, and @hourly are supported as convenient aliases. These use the hash system for automatic balancing. For example, @hourly is the same as H * * * * and could mean at any time during the hour. @midnight actually means some time between 12:00 AM and 2:59 AM.
