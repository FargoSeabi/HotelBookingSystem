#!/bin/bash
# Build and run HotelBookingSystem on Unix-like systems
javac *.java
if [ $? -ne 0 ]; then
  echo "Compilation failed"
  exit 1
fi
java Main
