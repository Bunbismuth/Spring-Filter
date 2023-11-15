# Spring-Filter
### A simple Spring application to study filters, used for a presentation in class to explain the concepts, life cycle and the uses of a servlet filter. This project was used to demonstrate the differences between Spring Filters and native Servlet Filters.

# Routes
## /pedidos
This route contains only one filters associated with it, it has to pass the LogFilter.

## /usuarios
This route contains two filters associated with it, first it has to pass the LogFilter and then the UserFilter.

# Filters
## LogFilter
This filter only logs information, just to demonstrate the flow and order of filters in the application.

## UserFilter
The UserFilter does only accept GET requests, if is not a GET, then the request is not passed by and stops in the filter.
