
package ro.iacmi.calendar

object DataProvider {

    fun getJsonHoliday(): String =
        """
            {
             "kind": "calendar#events",
             "etag": "\"p320fdadco3puq0g\"",
             "summary": "Holidays in United Kingdom",
             "updated": "2020-12-28T11:33:39.000Z",
             "timeZone": "UTC",
             "accessRole": "reader",
             "defaultReminders": [],
             "nextSyncToken": "CMCV3qnK8O0CEAAYAQ==",
             "items": [
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190101_60o30dr268o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTAxMDFfNjBvMzBkcjI2OG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "New Year's Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-01-01"
               },
               "end": {
                "date": "2019-01-02"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190101_60o30dr268o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190331_60o30c9o60o30dj26sqj0dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTAzMzFfNjBvMzBjOW82MG8zMGRqMjZzcWowZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Daylight Saving Time starts",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-03-31"
               },
               "end": {
                "date": "2019-04-01"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190331_60o30c9o60o30dj26sqj0dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190419_60o30dr36so30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTA0MTlfNjBvMzBkcjM2c28zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Good Friday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-04-19"
               },
               "end": {
                "date": "2019-04-20"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190419_60o30dr36so30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190421_60o30dr370o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTA0MjFfNjBvMzBkcjM3MG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Easter Sunday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-04-21"
               },
               "end": {
                "date": "2019-04-22"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190421_60o30dr370o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190506_60o30dr26go30e1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTA1MDZfNjBvMzBkcjI2Z28zMGUxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Early May Bank Holiday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-05-06"
               },
               "end": {
                "date": "2019-05-07"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190506_60o30dr26go30e1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190527_60o30dr26ko30e1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTA1MjdfNjBvMzBkcjI2a28zMGUxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Spring Bank Holiday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-05-27"
               },
               "end": {
                "date": "2019-05-28"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190527_60o30dr26ko30e1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20190608_60o32dr160o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTA2MDhfNjBvMzJkcjE2MG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Queen's Birthday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-06-08"
               },
               "end": {
                "date": "2019-06-09"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20190608_60o32dr160o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191027_60o30c9o64o30dj26sqj0dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTEwMjdfNjBvMzBjOW82NG8zMGRqMjZzcWowZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Daylight Saving Time ends",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-10-27"
               },
               "end": {
                "date": "2019-10-28"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191027_60o30c9o64o30dj26sqj0dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191031_60o30dr26so30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTEwMzFfNjBvMzBkcjI2c28zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Halloween",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-10-31"
               },
               "end": {
                "date": "2019-11-01"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191031_60o30dr26so30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191105_60o30dr270o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTExMDVfNjBvMzBkcjI3MG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Guy Fawkes Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-11-05"
               },
               "end": {
                "date": "2019-11-06"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191105_60o30dr270o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191110_60o30ob2cco30e1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTExMTBfNjBvMzBvYjJjY28zMGUxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Remembrance Sunday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-11-10"
               },
               "end": {
                "date": "2019-11-11"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191110_60o30ob2cco30e1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191225_60o30dr2c4o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTEyMjVfNjBvMzBkcjJjNG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Christmas Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-12-25"
               },
               "end": {
                "date": "2019-12-26"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191225_60o30dr2c4o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20191226_60o30dr2c8o30c1g60o30dr56c",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAxOTEyMjZfNjBvMzBkcjJjOG8zMGMxZzYwbzMwZHI1NmMgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Boxing Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2019-12-26"
               },
               "end": {
                "date": "2019-12-27"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20191226_60o30dr2c8o30c1g60o30dr56c@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200101_60o30dr268o30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDAxMDFfNjBvMzBkcjI2OG8zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "New Year's Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-01-01"
               },
               "end": {
                "date": "2020-01-02"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200101_60o30dr268o30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200329_60o30c9o60o30dj26sqj0dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDAzMjlfNjBvMzBjOW82MG8zMGRqMjZzcWowZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Daylight Saving Time starts",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-03-29"
               },
               "end": {
                "date": "2020-03-30"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200329_60o30c9o60o30dj26sqj0dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200410_60o30dr36so30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDA0MTBfNjBvMzBkcjM2c28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Good Friday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-04-10"
               },
               "end": {
                "date": "2020-04-11"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200410_60o30dr36so30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200412_60o30dr370o30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDA0MTJfNjBvMzBkcjM3MG8zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Easter Sunday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-04-12"
               },
               "end": {
                "date": "2020-04-13"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200412_60o30dr370o30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200423_60o30dr3cgo30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDA0MjNfNjBvMzBkcjNjZ28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "St. George's Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-04-23"
               },
               "end": {
                "date": "2020-04-24"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200423_60o30dr3cgo30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200525_60o30dr26ko30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDA1MjVfNjBvMzBkcjI2a28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Spring Bank Holiday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-05-25"
               },
               "end": {
                "date": "2020-05-26"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200525_60o30dr26ko30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20200613_60o32dr160o30e1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDA2MTNfNjBvMzJkcjE2MG8zMGUxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Queen's Birthday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-06-13"
               },
               "end": {
                "date": "2020-06-14"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20200613_60o32dr160o30e1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201025_60o30c9o64o30dj26sqj0dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDEwMjVfNjBvMzBjOW82NG8zMGRqMjZzcWowZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Daylight Saving Time ends",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-10-25"
               },
               "end": {
                "date": "2020-10-26"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201025_60o30c9o64o30dj26sqj0dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201031_60o30dr26so30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDEwMzFfNjBvMzBkcjI2c28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Halloween",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-10-31"
               },
               "end": {
                "date": "2020-11-01"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201031_60o30dr26so30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201105_60o30dr270o30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDExMDVfNjBvMzBkcjI3MG8zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Guy Fawkes Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-11-05"
               },
               "end": {
                "date": "2020-11-06"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201105_60o30dr270o30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201108_60o30ob2cco30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDExMDhfNjBvMzBvYjJjY28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Remembrance Sunday",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-11-08"
               },
               "end": {
                "date": "2020-11-09"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201108_60o30ob2cco30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201225_60o30dr2c4o30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDEyMjVfNjBvMzBkcjJjNG8zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Christmas Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-12-25"
               },
               "end": {
                "date": "2020-12-26"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201225_60o30dr2c4o30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201226_60o30dr2c8o30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDEyMjZfNjBvMzBkcjJjOG8zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Boxing Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-12-26"
               },
               "end": {
                "date": "2020-12-27"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201226_60o30dr2c8o30c1g60o30dr56g@google.com",
               "sequence": 0
              },
              {
               "kind": "calendar#event",
               "etag": "\"3101473502000000\"",
               "id": "20201228_60o30or4coo30c1g60o30dr56g",
               "status": "confirmed",
               "htmlLink": "https://www.google.com/calendar/event?eid=MjAyMDEyMjhfNjBvMzBvcjRjb28zMGMxZzYwbzMwZHI1NmcgZW4udWsjaG9saWRheUB2",
               "created": "2019-02-21T08:12:31.000Z",
               "updated": "2019-02-21T08:12:31.000Z",
               "summary": "Substitute Bank Holiday for Boxing Day",
               "creator": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "organizer": {
                "email": "en.uk#holiday@group.v.calendar.google.com",
                "displayName": "Holidays in United Kingdom",
                "self": true
               },
               "start": {
                "date": "2020-12-28"
               },
               "end": {
                "date": "2020-12-29"
               },
               "transparency": "transparent",
               "visibility": "public",
               "iCalUID": "20201228_60o30or4coo30c1g60o30dr56g@google.com",
               "sequence": 0
              }
             ]
            }
        """.trimIndent()
}
