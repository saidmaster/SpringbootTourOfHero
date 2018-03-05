import { Injectable } from '@angular/core';

@Injectable()
export class MessageService {

  constructor() { }
  messages: string[] = [];

  addMessage(message: string): void {
    this.messages.push(message);
  }
  clear(): void {
    this.messages = [];
  }

}
