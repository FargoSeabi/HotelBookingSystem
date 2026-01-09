# 🏨 HotelBookingSystem

A simple Java console-based application for managing hotel room bookings. The system allows users to check room availability, book rooms, and view customer information.

## 📁 Project Structure

```
HotelBookingSystem/
│
├── Main.java     # Main class with hotel booking logic
└── README.md     # Project documentation
```

## 🧑‍💻 Features

- View all rooms and their statuses (empty or occupied)
- Add a customer to a room
- View empty rooms
- Delete customer from a room
- Find a room by customer name
- Store and load data to/from a file
- Sort customer names alphabetically

# HotelBookingSystem

Simple console-based Java application for managing hotel room bookings.

## Summary

This program demonstrates basic hotel booking features: listing rooms,
adding/removing guests, checking empty rooms, finding rooms by guest name,
storing/loading data to a file, and sorting guest names.

## Project structure

- `Main.java` — program entrypoint and menu-driven UI
- `Room.java`, `Reservation.java`, `Guest.java`, `Hotel.java`, etc. — core classes
- `README.md` — this file

## Requirements

- Java 8 or later

## Build & run

Open a terminal in the project directory and run:

```bash
javac *.java
java Main
```

On Windows PowerShell you can copy/paste the same commands.

The program runs as an interactive console application and will prompt for
input (menu commands, dates, guest details, etc.).

## Example

The program prints room listings and a sample reservation flow. See the
console output when you run `java Main`.

## Contributing

If you want improvements (unit tests, input validation, CLI args, or a GUI),
open an issue or submit a pull request.

## License

This repository has no license specified. Add a `LICENSE` file if you want to
clarify reuse/copyright terms.