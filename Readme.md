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


### Step 3, Add a namespace

```
kubectl config set-context --current --namespace=time-machine
```


### Step 4, Fix the "test" 

```
kubectl port-forward time-machine 8080:8080

kubectl delete pod time-machine
```

### Step 5, Add a deployment and scale it

```
kubectl scale --current-replicas=1 --replicas=3 deployment/time-machine
```

### Step 6, Routing , ingress and service
```
curl localhost/

Note: 
https://kubernetes.github.io/ingress-nginx/deploy/#quick-start
```


### Step 7, So PODs

```
kubectl exec -it time-machine-7f8d4bc44b-5r9dl --container=netshoot  bash
tcpdump -v -i any -w file.pcap
tshark  -r file.pcap -T fields -e http.request.method  -e http.request.full_uri
```
