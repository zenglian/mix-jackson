
A simple jersey application using jackson v1.9.2 and v2.9.8 at the same time.

### Test Result

```
/$ curl -s  -H "Content-Type:application/json" -X POST -d "{\"v1.name\":\"tom\"}" "http://localhost:8123/api/v1/models/"
{"v1.name":"tom"}

/$ curl -s "http://localhost:8123/api/v1/models/tom"
{"v1.name":"tom"}

/$ curl -s  -H "Content-Type:application/json" -X POST -d "{\"v2.name\":\"tom\"}" "http://localhost:8123/api/v2/models/"
{"v2.name":"tom"}

/$ curl -s "http://localhost:8123/api/v2/models/tom"
{"v2.name":"tom"} 
```