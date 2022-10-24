### Step 1, Create Service

```
curl --silent --show-error localhost:8080 | jq  
```

### Step 2, Containerise Service

```
docker build . -t time-machine

docker run  --name time-machine -p 8080:8080 time-machine --name time-machine 

Note : The health check

curl --silent --show-error -v  --silent --show-error localhost:8080/actuator/health | jq

```