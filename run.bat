@echo off
REM Build and run HotelBookingSystem on Windows
javac *.java
if %errorlevel% neq 0 (
  echo Compilation failed.
  exit /b %errorlevel%
)
java Main
