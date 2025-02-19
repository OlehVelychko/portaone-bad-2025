FROM ubuntu:latest
LABEL authors="narsil"

ENTRYPOINT ["top", "-b"]