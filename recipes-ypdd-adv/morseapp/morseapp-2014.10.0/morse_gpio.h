/* morse_gpio header */

/*
 * Between Linux kernel 3.17 and 3.18 there was a change in how GPIOs are enumerated
 * specifically instead of counting down from 256, they now count down from 512.
 * This means that all GPIOs are now offset by an additional 256 in newer kernels
 * so the following code attempts to handle that
 */

#define GPIO_DEVICE_NONE         0
#define GPIO_DEVICE_BEAGLEBLACK  1
#define GPIO_DEVICE_MINNOWMAX    2
#define GPIO_DEVICE_WANDBOARD    3
#define GPIO_DEVICE_SIMULATOR    4

#define GPIO_OFFSET              256

#define GPIO_DEVICE_BEAGLEBLACK_KEY  GPIO_OFFSET+60
#define GPIO_DEVICE_BEAGLEBLACK_LED  GPIO_OFFSET+7
#define GPIO_DEVICE_MINNOWMAX_KEY    GPIO_OFFSET+84
#define GPIO_DEVICE_MINNOWMAX_LED    GPIO_OFFSET+82
#define GPIO_DEVICE_WANDBOARD_KEY    GPIO_OFFSET+24
#define GPIO_DEVICE_WANDBOARD_LED    GPIO_OFFSET+91

extern void open_gpio_ports(void);
extern void close_gpio_ports(void);

extern int get_device_key(void);
extern int set_device_led(int led);
extern int get_user_key(void);
extern void set_user_key(int newkey);
extern void toggle_user_key(void);

extern int set_device_simkey(int key);
extern void get_device_simkey(int *key,int *led,int *broadcast,int *loopback);
extern void set_sim_broadcast(int broadcast);
extern void set_sim_loopback(int loopback);
extern void toggle_device_simkey(void);
extern char *get_sim_device_state_pretty();
